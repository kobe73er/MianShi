package T_06;
//test the Class.forName()
public class Client {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public static void main(String[] args) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		// Car car = (Car) Class.forName("T_06.Car").newInstance();
		// Class.forName("T_06.Car");
		System.out.println(Car.name);
	}

}
