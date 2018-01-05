public class Light {
    public static void main (String[] args){

        double lightPower = Double.parseDouble(args[0]);
        double dimPower;
        double brightenPower;
        double lightPowerOn;
        double lightPowerOf;

        Light firstLight = new Light();

        //System.out.println(firstLight.on());
        //System.out.println(firstLight.off());
        System.out.println(firstLight.dim(lightPower));
        //System.out.println(firstLight.brighten(lightPower));
    }

    public String on(){
        String lightPowerOn = "The Light is ON";
            return lightPowerOn;
        }

    public String off(){
        String lightPowerOf = "The Light is OFF";
        return lightPowerOf;
        }

    public double dim(double lightPower) {
        double dimPower = lightPower - 10;
        if (dimPower <= 0) {
            System.out.println("The light is OFF");
        } else {
            System.out.println("The light power is now dimmed with 10 KwH");
        }return dimPower;
    }

    public double brighten(double lightPower) {
        double brightenPower = lightPower + 10;

        if (brightenPower == 100) {
            System.out.println("The light is now at its full power ");
        } else if (brightenPower > 100){
            System.out.println("The light power cannot be brighter than 100 KwH");
            return lightPower;
        }else
            System.out.println("The light power is brighter with 10 KwH");
        return brightenPower;
    }

}
