public class ProdoPrecious {
    public static void main(String[] arg) {
        int a = 127;
        String binaryString = Integer.toBinaryString(a);
        System.out.println(binaryString);

        System.out.println(Integer.parseInt(binaryString, 2));

//        n	5
//        arr1	[9, 20, 28, 18, 11]
//        arr2	[30, 1, 21, 17, 28]
//        출력	["#####","# # #", "### #", "# ##", "#####"]

        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        String[] stringArr1 = new String[n];
        String[] stringArr2 = new String[n];

        String[] answer = new String[n];
        String row = "";
        for(int i=0; i<n; i++) {
            row += " ";
        }
        for(int i=0; i<n; i++) {
            stringArr1[i] = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replaceAll(" ", "0");
            stringArr2[i] = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replaceAll(" ", "0");
            answer[i] = row;
        }

        System.out.println(stringArr1[0]);
        System.out.println(row);

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(stringArr1[i].charAt(j)=='1' || stringArr2[i].charAt(j)=='1') {
                    answer[i] = answer[i].substring(0, j) + "#" + answer[i].substring(j+1, n);
                    continue;
                }

                else {
                    continue;
                }
            }
        }

        System.out.println(answer[1]);


    }
}
