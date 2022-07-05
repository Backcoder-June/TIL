package Campus.Test.InterfaceTest;

public class Speaker implements Volume{

    int VolumLevel;

    @Override
    public void volumeUp(int VolLevel) {

        VolumLevel += VolLevel;


        if (VolumLevel >100 ){
            VolumLevel = 100;
        }

        System.out.println("Speaker 볼륨 " + VolLevel + "만큼 올려서 현재 볼륨 : " + VolumLevel);


    }

    @Override
    public void volumeDown(int VoleLevel) {

        VolumLevel -= VoleLevel;



        if (VolumLevel<-100){
            VolumLevel = -100;
        }

        System.out.println("Speaker 볼륨 " + VoleLevel + "만큼 내려서 현재 볼륨 : " + VolumLevel);



    }
}
