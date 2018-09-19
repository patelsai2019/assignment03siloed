public class siloed{
    public static void main(String[] args){

        int towerHeight1=72;

        int towerHeight2=19;

        int towerHeight3=50;

        int towerHeight4=67;

        int towerHeight5=16;

        int towerHeight6=53;

        int towerHeight7=69;

        int towerHeight8=30;

        int towerHeight9=52;

        int towerHeight10=40;

        int towerHeight11=31;

        int towerHeight12=75;

        int towerDiameter1=22;

        int towerDiameter2=18;

        int towerDiameter3=13;

        int towerDiameter4=16;

        int towerDiameter5=14;

        int towerDiameter6=23;

        int towerDiameter7=22;

        int towerDiameter8=22;

        int towerDiameter9=23;

        int towerDiameter10=16;

        int towerDiameter11=18;

        int towerDiameter12=23;

        int pop = 37640;

        int time = 28;

        double pi = 3.141592653;

        double usage = 65;

        double towerVolume1 = pi*towerHeight1*(towerDiameter1/2.0)*(towerDiameter1/2.0);

        double towerVolume2 = pi*towerHeight2*(towerDiameter2/2.0)*(towerDiameter2/2.0);

        double towerVolume3 = pi*towerHeight3*(towerDiameter3/2.0)*(towerDiameter3/2.0);

        double towerVolume4 = pi*towerHeight4*(towerDiameter4/2.0)*(towerDiameter4/2.0);

        double towerVolume5 = pi*towerHeight5*(towerDiameter5/2.0)*(towerDiameter5/2.0);

        double towerVolume6 = pi*towerHeight6*(towerDiameter6/2.0)*(towerDiameter6/2.0);

        double towerVolume7 = pi*towerHeight7*(towerDiameter7/2.0)*(towerDiameter7/2.0);

        double towerVolume8 = pi*towerHeight8*(towerDiameter8/2.0)*(towerDiameter8/2.0);

        double towerVolume9 = pi*towerHeight9*(towerDiameter9/2.0)*(towerDiameter9/2.0);

        double towerVolume10 = pi*towerHeight10*(towerDiameter10/2.0)*(towerDiameter10/2.0);

        double towerVolume11 = pi*towerHeight11*(towerDiameter11/2.0)*(towerDiameter11/2.0);

        double towerVolume12 = pi*towerHeight12*(towerDiameter12/2.0)*(towerDiameter12/2.0);

        double totalVolume = towerVolume1+towerVolume2+towerVolume3+towerVolume4+towerVolume5+towerVolume6+towerVolume7+towerVolume8+towerVolume9+towerVolume10+towerVolume11+towerVolume12;

        double wpp = totalVolume/pop;

        double watertime = wpp/time;

        System.out.printf("Every person needs to save ~%.2f",usage-(watertime * 264.172));
        System.out.print(" gallons of water in order for it to last "+ time + " days.\n");

    }
}




