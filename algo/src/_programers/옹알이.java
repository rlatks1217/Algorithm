package _programers;


public class 옹알이 {

   public static void main(String[] args) {
      
      String[] pronunciation = {"aya","ye","woo","ma"};
      
//      String[] babblingInput = {"ayaye","uuuma","ye","yemawoo","ayaa"}; 
      String[] babblingInput = {"aya","yee","u","maa","wyeoo"}; 
      
      //3조합: 7, 8/ 4조합 : 10 
      int count = 0;
      for (int i = 0; i < babblingInput.length; i++) {
         String babbling = babblingInput[i];
         
         if (babbling.length() >= 2 && babbling.length() <= 10) {
            
            if(babbling.length() < 4) {
               for (int j = 0; j < 4; j++) {
                  if (pronunciation[j].equals(babblingInput[i])) {
                     count++;
                     break;
                  }
               }
            }else if (babbling.length() < 7) {
   
            	if (babbling.contains("ye") && babbling.length() == 5) {
            		if(babbling.contains("aya")) {
            			count++;
            		}
            	}else if (babbling.contains("ye") && babbling.length() == 5) {
            		if(babbling.contains("woo")) {
            			count++;
            		}
            	}
            	else if (babbling.contains("ye") && babbling.length() == 4) {
            		if(babbling.contains("ma")) {
            			count++;
            		}
            	}else if (babbling.contains("aya") && babbling.length() == 6) {
            		if(babbling.contains("woo")) {
            			count++;
            		}
            	}else if (babbling.contains("aya") && babbling.length() == 5) {
            		if(babbling.contains("ma")) {
            			count++;
            		}
            	}else if (babbling.contains("woo") && babbling.length() == 5) {
            		if(babbling.contains("ma")) {
            			count++;
            		}
            	}
            }else if (babbling.length() < 9) {
            	
               if (!(babbling.contains("ye")) && babbling.length() == 8) { //길이체크를 안해줄 경우 mayawoo 와 같은 케이스도 count가 증가되기 때문에 체크해줘야 함
                  if (babbling.contains("aya")) {
                     if (babbling.contains("woo")) {
                        if (babbling.contains("ma")) {
                           count++;
                        }
                     }
                  }
               }else if (!(babbling.contains("aya")) && babbling.length() == 7) {
            	  if (babbling.contains("ye") ) {
            		  if (babbling.contains("woo")) {
            			  if (babbling.contains("ma")) {
            				  count++;
            			  }
            		  }            		  
            	  }
               }else if (!(babbling.contains("woo")) && babbling.length() == 7) {
             	  if (babbling.contains("ye")) {
            		  if (babbling.contains("aya")) {
            			  if (babbling.contains("ma")) {
            				  count++;
            			  }
            		  }            		  
            	  }
               }else if (!(babbling.contains("ma")) && babbling.length() == 8) {
            	   if (babbling.contains("ye")) {
            		   if (babbling.contains("aya")) {
            			   if (babbling.contains("woo")) {
            				   count++;
            			   }
            		   }            		  
            	   }
               }
               
            }else if (babbling.length() == 10){
				if (babbling.contains("ye")) {
					if (babbling.contains("aya")) {
						if (babbling.contains("woo")) {
							if(babbling.contains("ma")) {
								count++;
							}
						}
					}
				}
			}
			
		}
      }//end for
      
      System.out.println(count);
      
   }

}