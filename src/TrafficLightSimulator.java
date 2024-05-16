public class TrafficLightSimulator {


    public enum LightColor {
        RED,
        YELLOW,
        GREEN
    }


    public static class TrafficLight {
        private LightColor currentColor;

        public TrafficLight(LightColor initialColor) {
            this.currentColor = initialColor;
        }

        public void changeColor() {
            switch (currentColor) {
                case RED:
                    currentColor = LightColor.GREEN;
                    break;
                case GREEN:
                    currentColor = LightColor.YELLOW;
                    break;
                case YELLOW:
                    currentColor = LightColor.RED;
                    break;
            }
        }

        @Override
        public String toString() {
            return "Current Light: " + currentColor;
        }
    }

    public static void main(String[] args) {

        TrafficLight light = new TrafficLight(LightColor.RED);

        for (int i = 0; i < 10; i++) {
            light.changeColor();
            System.out.println(light);
        }
    }
}