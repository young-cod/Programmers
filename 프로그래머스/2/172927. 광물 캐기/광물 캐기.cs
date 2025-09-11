using System;
using System.Collections.Generic;

public class Solution {
   static int minFatigue = int.MaxValue;
static int[,] fatigueList = new int[,] { { 1, 1, 1 }, { 5, 1, 1 }, { 25, 5, 1 } };

static void BT(int groupIdx, int[] picks, List<int[]> minerals, int currentFatigue)
{
    //미네랄을 다 캐거나 || 곡괭이를 다 쓰거나
    if (groupIdx == minerals.Count || picks[0] == 0 && picks[1] == 0 && picks[2] == 0)
    {
        minFatigue = Math.Min(minFatigue, currentFatigue);
        return;
    }

    // 1. 다이아몬드 곡괭이로 캐는 경우
    if (picks[0] > 0)
    {
        picks[0]--;
        int fatigue = CalcFatigue(0, minerals[groupIdx]);
        BT(groupIdx + 1, picks, minerals, currentFatigue + fatigue);
        picks[0]++;
    }

    // 2. 철 곡괭이로 캐는 경우
    if (picks[1] > 0)
    {
        picks[1]--;
        int fatigue = CalcFatigue(1, minerals[groupIdx]);
        BT(groupIdx + 1, picks, minerals, currentFatigue + fatigue);
        picks[1]++;
    }

    // 3. 돌 곡괭이로 캐는 경우
    if (picks[2] > 0)
    {
        picks[2]--;
        int fatigue = CalcFatigue(2, minerals[groupIdx]);
        BT(groupIdx + 1, picks, minerals, currentFatigue + fatigue);
        picks[2]++;
    }

}

static int CalcFatigue(int pick, int[] groupIdx)
{
    int fatigue = 0;
    for (int i = 0; i < groupIdx.Length; i++)
    {
        fatigue += groupIdx[i] * fatigueList[pick, i];
    }

    return fatigue;
}


public int solution(int[] picks, string[] minerals)
{
    minFatigue = int.MaxValue;

    // 광물들을 5개씩 그룹화하고 각 그룹의 광물 종류 개수를 저장
    List<int[]> mineralsGroup = new List<int[]>();
    int totalPicks = picks[0] + picks[1] + picks[2];

    for (int i = 0; i < minerals.Length && mineralsGroup.Count < totalPicks; i += 5)
    {
        int[] group = new int[3];
        for (int j = i; j < i + 5 && j < minerals.Length; j++)
        {
            if (minerals[j] == "diamond") group[0]++;
            else if (minerals[j] == "iron") group[1]++;
            else group[2]++;
        }
        mineralsGroup.Add(group);
    }
    BT(0, picks, mineralsGroup, 0);

    return minFatigue;

}
}