package Kris.start.Money.step;

public class Main {

    public static void main(String[] args) {
            String[][] arrs1 = {
                    {"2", "2", "2", "2"},
                    {"2", "2", "2", "2"},
                    {"2", "2", "2", "2"},
                    {"2", "2", "2", "2"}
            };


            try {
                arrcheck(arrs1);
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }catch (MyArrayDataException e){
                e.printStackTrace();
            }
            System.out.println("end");


        }


        public static void arrcheck(String[][] arrs) throws MyArrayDataException {
            int sum = 0;
            int cordinateX = 0;
            int cordinateY = 0;


            for (int i = 0; i < arrs.length; i++) {
                cordinateX = i;
                for (int j = 0; j < arrs[i].length; j++) {
                    cordinateY = j;
                    try {
                        int arrsInt = Integer.parseInt(arrs[i][j]);
                        sum += arrsInt;
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(cordinateX + " столбец " + cordinateY + " строка ");
                    }

                    if (i > 3 || j > 3 || arrs[0].length < 4 || arrs[1].length < 4 || arrs[2].length < 4 || arrs[3].length < 4) {
                        throw new MyArraySizeException("неправильный размер массива");


                    }

                }


            }
            System.out.println("Общая сумма: "+ sum);
        }
    }

