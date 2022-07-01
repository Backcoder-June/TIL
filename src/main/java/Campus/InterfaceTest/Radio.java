package Campus.InterfaceTest;

public class Radio implements Volume{

    int VolumLevel;
    @Override
    public void volumeUp(int VolLevel) {

        VolumLevel += VolLevel;

        System.out.println("Radio 볼륨 " + VolLevel + "만큼 올려서 현재 볼륨 : " + VolumLevel);

    }

    @Override
    public void volumeDown(int VoleLevel) {

        VolumLevel -= VoleLevel;


        System.out.println("Radio 볼륨 " + VoleLevel + "만큼 내려서 현재 볼륨 : " + VolumLevel);


    }
}
