

    public class NumberOfDaysInMonth {
        public static void main(String[] args) {
            System.out.println(isLeapYear(2000));

        }
        public static boolean isLeapYearCheck(int year) {
                if(year % 4 == 0){
                    if(year % 100 == 0){
                        if(year % 400 == 0){
                            return true;

                        }else{
                            return false;
                        }

                    }else{
                        return true;
                    }

                }else{
                    return false;
                }
        }
        public static boolean isLeapYear(int year) {
            if(year < 1 || year > 9999) {
                return false;
            }
            return isLeapYearCheck(year);

        }
    }
