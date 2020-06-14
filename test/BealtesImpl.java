public class BealtesImpl implements BealtesCar {
    @Override
    public void sayBealtes(Car car, Beatles beatles) {
        System.out.println("we have a"+car.getCarName()+"it from"+car.getMetropolis()+"it Color is"+car.getColor()+"every bulityfiulte"
                +"it price is"+car.getPrice()+"it name is"+beatles.getBeatlesCar());
    }
}
