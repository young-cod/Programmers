using System;

public class Solution {
    public bool CheckMove(string[] park, char dir, int move, int x, int y)
    {
        int maxH = park.Length;
        int maxW = park[0].Length;

        int nextX = x;
        int nextY = y;

        switch (dir)
        {
            case 'N':
                nextY -= move;
                break;
            case 'S':
                nextY += move;
                break;
            case 'W':
                nextX -= move;
                break;
            case 'E':
                nextX += move;
                break;
        }

        if (nextY < 0 || nextY >= maxH || nextX < 0 || nextX >= maxW)
        {
            return false;
        }

        for (int i = 1; i <= move; i++)
        {
            int checkX = x, checkY = y;

            switch (dir)
            {
                case 'N':
                    checkY = y - i;
                    break;
                case 'S':
                    checkY = y + i;
                    break;
                case 'W':
                    checkX = x - i;
                    break;
                case 'E':
                    checkX = x + i;
                    break;
            }

            if (park[checkY][checkX] == 'X')
            {
                return false; // 경로에 장애물('X') 발견
            }
        }
        return true;
    }
    public int[] solution(string[] park, string[] routes) {
        int x = 0, y = 0;

        for (int i = 0; i < park.Length; i++)
        {
            for (int j = 0; j < park[i].Length; j++)
            {
                if (park[i][j] == 'S')
                {
                    x = j;
                    y = i;
                    break;
                }
            }
        }

        for (int i = 0; i < routes.Length; i++)
        {
            char dir = routes[i][0];
            int move = routes[i][2]-'0';
            if (CheckMove(park, dir, move,x,y ))
            {
                switch (dir)
                {
                    case 'N':
                        y -= move;
                        break;
                    case 'S':
                        y += move;
                        break;
                    case 'W':
                        x -= move;
                        break;
                    case 'E':
                        x += move;
                        break;
                }
            }
        }
        return new int[] { y, x };
    }
}