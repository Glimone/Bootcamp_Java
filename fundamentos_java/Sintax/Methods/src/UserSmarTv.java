public class UserSmarTv {

    public static void main(String[] args) {
        
        SmarTv smarTv =  new SmarTv();


        //Stete
        smarTv.on();
        System.out.println("TV ligada? " + smarTv.state);

        smarTv.off();
        System.out.println("Tv ligada? " + smarTv.state);

        //VOlum
        smarTv.moreVolum();
        System.out.println("O volume está em: " + smarTv.volum);

        smarTv.menusVolum();
        System.out.println("O volume está em: " + smarTv.volum);

        //Chanel
        smarTv.backChanel();
        System.out.println("Canal atual: " + smarTv.chanel);
        smarTv.frontChanel();
        System.out.println("Canal atual: " + smarTv.chanel);

        smarTv.moveChanel(7);
        System.out.println("Canal atual: " + smarTv.chanel);





    }
    
}
