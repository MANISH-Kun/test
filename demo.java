class demo {
    public static void main(String[] args) {
        int a = 50;
        int b = 20;
        int c = 60;
        int d = 25;

        int greatest = (a>b&&a>c&&a>d?a:(b>c&&b>d?b:(c>d?c:d)));
        System.out.println("greatest:"+greatest);

        //second largest no
        int second_large  = (greatest==a)?((b>c&&b>d)?b:(c>d)?c:d):
                            (greatest==b)?((a>c&&a>d)?a:(c>d)?c:d):
                            (greatest==c)?((a>b&&a>d)?a:(b>d)?b:d):
                            (a>b&&a>c)?a:(b>c)?b:c;

        System.out.println("second largest:"+second_large);

        
    }
}
