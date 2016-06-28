package cs525.labs.flyweight;

public class HealthProfile {

	private String profile;

	public HealthProfile(String profile) {
		this.profile = profile;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "\nHealth Profile: " + profile;
	}

}
