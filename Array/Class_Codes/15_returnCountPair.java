
/*
    Given an character array (lower case)
    return the count of pair(i,j) such that

    a) i < j
    b) arr[i] = 'a';
       arr[j] = 'g';

    Arr[a,b,e,g,a,g]

    output = 3;
 */

 class Solution {

    static int optimizedApproch(char arr[]) {

        int count = 0;
        int countA = 0;
        
        for(int i=0; i<arr.length; i++) {

            if(arr[i] == 'a') {

                countA++;
            }
            if(arr[i] == 'g') {

                count+=countA;
            }
        }
        return count;
    }

    static int bruteForceApproach(char arr[]) {

        int count = 0;

        for(int i=0; i<arr.length; i++) {

            for(int j=0; j<arr.length; j++) {

                if((i < j) && (arr[i] == 'a' && arr[j] == 'g')) {

                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {

        char arr[] = new char[] {'a','b','e','g','a','g'};

        int count1 = bruteForceApproach(arr);
        int count2 = optimizedApproch(arr);

        System.out.println("Bruteforce Count : "+count1);
        System.out.println("Optimize Count : "+count2);

    }
 }
