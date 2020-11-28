package UberSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {

	@Given("User wants to select car type {string} from the uber app")
	public void user_wants_to_select_car_type_from_the_uber_app(String carType) {
	    System.out.println("User wants to select car type: "  + carType + "from the uber app");
	}

	@When("User selects car {string} and pick up point {string} and drop point {string}")
	public void user_selects_car_and_pick_up_point_and_drop_point(String carType, String pickupPoint, String dropPoint) {
		 System.out.println("User selects car - " + carType + " and pick up point - " + pickupPoint + " and drop point -" + dropPoint);
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
		System.out.println("Driver starts the journey");
	}

	@Then("Drives ends the journey")
	public void drives_ends_the_journey() {
		System.out.println("Driver ends the journey");
	}

	@Then("User pays {int} Rs.")
	public void user_pays_rs(Integer price) {
		System.out.println("User pays " + price + " Rs.");
	}
}
