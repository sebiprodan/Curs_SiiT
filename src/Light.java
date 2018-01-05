public class Light {
    public static void main (String[] args){

        double lightPower = Double.parseDouble(args[0]);
        double dimPower = Double.parseDouble(args[1]);
        double brightenPower = Double.parseDouble(args[1]);

        Light firstLight = new Light();

        //System.out.println(firstLight.on(lightPower));
        //System.out.println(firstLight.off(lightPower));
        System.out.println(firstLight.dim(lightPower,dimPower));
        //System.out.println(firstLight.brighten(lightPower,brightenPower));
    }

    public double on(double lightPower){
        if (lightPower == 100) {
            System.out.println("The light is on with its full power which is " + lightPower + "kWh");
        }
        System.out.println("The current light power is: ");
        return lightPower;
    }

    public double off(double lightPower){
        if (lightPower == 0){
            System.out.println("The light is of");
        }
        System.out.println("The current light power is: ");
        return lightPower;
    }

    public double dim(double lightPower, double dimPower) {
        double currentPower = lightPower;
        lightPower = lightPower - dimPower;
        if (lightPower > 0) {
            System.out.println("The light power was dimed with " + dimPower + "kWh");
            System.out.println("The current light power is: ");
            return lightPower;
        } else {
            System.out.println("Please use switch off the light instead of dimming it. The light power will remain: ");
            return currentPower;
        }
    }
    public double brighten(double lightPower, double brightenPower){
        lightPower = lightPower + brightenPower;
        if(lightPower > 100){
            System.out.println("The light power is at its full power and can not be brighter");
            System.out.println("The current light power will remain: ");
            return lightPower - brightenPower;
        }
        else {
            System.out.println("The light power was brightened  with " + brightenPower + "kWh");
        }
        System.out.println("The current light power is: ");
        return lightPower;
    }

}
