package _programmers;

import java.util.Arrays;

public class 다트게임 {

	public static void main(String[] args) {

		String dartResult = "1D2S3T*";

		String[] changes = new String[3];
		int[] score = new int[3];
		int cnt = 0;
		int chCnt = 0;

		for (int i = 0; i < dartResult.length(); i++) {

			try {
				if (i == 0) {
					if ((dartResult.charAt(i)+"").equals("1")) {
						if ((dartResult.charAt(i+1)+"").equals("0")) {
							score[cnt] = 10;
							cnt++;
							i++;
						}else {
							score[cnt] = 1;
							cnt++;
						}
					} else {
						score[cnt] = Integer.parseInt((dartResult.charAt(i) + ""));
						cnt++;
					}
				} else {
					if ((dartResult.charAt(i)+"").equals("1")) {
						if ((dartResult.charAt(i+1)+"").equals("0")) {
							score[cnt] = 10;
							cnt++;
							changes[chCnt] = dartResult.substring(0, i);
							chCnt++;
							dartResult = dartResult.replace(changes[chCnt-1], "");
							i = -1;
						} else {
							score[cnt] = 1;
							cnt++;
							changes[chCnt] = dartResult.substring(0, i);
							chCnt++;
							dartResult = dartResult.replace(changes[chCnt-1], "");
							i = -1;							
							
						}
					} else {
						score[cnt] = Integer.parseInt((dartResult.charAt(i) + ""));
						cnt++;
						changes[chCnt] = dartResult.substring(0, i);
						chCnt++;
						dartResult = dartResult.replace(changes[chCnt-1], "");
						i = 0;
					}
					
					if (cnt == 3) {
						changes[chCnt] = dartResult;
					}
				}

			} catch (Exception e) {
				continue;
			}

		}

		System.out.println(Arrays.toString(changes));
		System.out.println(Arrays.toString(score));

		for (int i = 0; i < changes.length; i++) {
			if (i == 0) {
				if (changes[i].contains("S")) {
					if (changes[i].contains("*")) {
						score[i] = score[i] * 2;
					} else if (changes[i].contains("#")) {
						score[i] = score[i] * (-1);
					}
				} else if (changes[i].contains("D")) {
					score[i] = score[i] * score[i];
					if (changes[i].contains("*")) {
						score[i] = score[i] * 2;
					} else if (changes[i].contains("#")) {
						score[i] = score[i] * (-1);
					}
				} else if (changes[i].contains("T")) {
					score[i] = score[i] * score[i] * score[i];
					if (changes[i].contains("*")) {
						score[i] = score[i] * 2;
					} else if (changes[i].contains("#")) {
						score[i] = score[i] * (-1);
					}
				}
			} else {
				if (changes[i].contains("S")) {
					if (changes[i].contains("*")) {
						if (changes[i - 1].contains("*")) {
							score[i] = score[i] * 2;
							score[i-1] = score[i - 1] * 2;
						} else if (changes[i - 1].contains("#")) {
							score[i] = score[i] * 2;
							score[i-1] = score[i - 1] * 2;
						} else {
							score[i] = score[i] * 2;
							score[i-1] = score[i - 1] * 2;
						}
					} else if (changes[i].contains("#")) {
						score[i] = score[i] * (-1);
					}
				} else if (changes[i].contains("D")) {
					score[i] = score[i] * score[i];
					if (changes[i].contains("*")) {
						if (changes[i - 1].contains("*")) {
							score[i] = score[i] * 2;
							score[i-1] = score[i - 1] * 2;
						} else if (changes[i - 1].contains("#")) {
							score[i] = score[i] * 2;
							score[i-1] = score[i - 1] * 2;
						} else {
							score[i] = score[i] * 2;
							score[i-1] = score[i - 1] * 2;
						}
					} else if (changes[i].contains("#")) {
						score[i] = score[i] * (-1);
					}
				} else if (changes[i].contains("T")) {
					score[i] = score[i] * score[i] * score[i];
					if (changes[i].contains("*")) {
						if (changes[i - 1].contains("*")) {
							score[i] = score[i] * 2;
							score[i-1] = score[i - 1] * 2;
						} else if (changes[i - 1].contains("#")) {
							score[i] = score[i] * 2;
							score[i-1] = score[i - 1] * 2;
						} else {
							score[i] = score[i] * 2;
							score[i-1] = score[i - 1] * 2;
						}
					} else if (changes[i].contains("#")) {
						score[i] = score[i] * (-1);
					}
				}

			}
			
		}

		int answer = 0;
		for (int j = 0; j < score.length; j++) {
			answer += score[j];
		}

		System.out.println(answer);
		
	}
	

}
//substring(시작인덱스, 끝인덱스) : (시작 인덱스)부터 (끝인덱스 -1) 까지를 자른다.
//replace(바꿀문자열, "")를 하게 되면 dartResult의 length도 달라짐 => 하지만 i는 계속 늘고 있는 형태임 
//=> i를 0으로 초기화해주지 않으면 7자의 문자열 중 3번째까지 잘랐다고 할 때 4번째가 0번째 문자열이 되지만 i(index)는 2 -> 3으로 변하는 상황이기 때문에 실제로 i번째 문자열은 7번째 문자열을 가리키게 됨
//Character.isDigit(character타입 변수) => 해당 글자가 숫자인지 문자인지 판단 