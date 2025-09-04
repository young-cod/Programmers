#include <string>
#include <vector>
#include <map>
#include <iostream>
#include <algorithm>

using namespace std;

vector<int> solution(vector<string> id_list, vector<string> report, int k) {

	vector<int> answer;
	map<string, vector<string>> user;
	map<string, vector<string>> feedback;

	for (int i = 0; i < id_list.size(); i++) {
		user.insert(make_pair(id_list[i], 0));
		feedback.insert(make_pair(id_list[i], 0));
	}

	//sort(report.begin(),report.end());
	//report.erase(unique(report.begin(), report.end()),report.end());

	for (int i = 0; i < report.size(); i++) {
		int idx = report[i].find(" ");
		string offen = report[i].substr(0, idx);
		string defen = report[i].substr(idx + 1);

		if (find(user[defen].begin(), user[defen].end(), offen) == user[defen].end()) {
			user[defen].push_back(offen);
		}
	}

	map<string, vector<string>>::iterator it;
	for (it = user.begin(); it != user.end(); it++) {
		if (it->second.size() / k >= 1) {
			for (int i = 0; i < it->second.size(); i++) {
				feedback[it->second[i]].push_back(it->first);
			}
		}
	}
	map<string, vector<string>>::iterator ff;
	for (int i = 0; i < id_list.size(); i++) {
		for (ff = feedback.begin(); ff != feedback.end(); ff++) {
			if (ff->first == id_list[i]) {
				answer.push_back(ff->second.size());
			}
		}
	}

	return answer;
}