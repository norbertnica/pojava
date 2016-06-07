package pojava;

public class Particle {
	private float x, y, z;
	private float speedX, speedY, speedZ;
	private float accelarationX, accelarationY, accelarationZ;
	private float electricCharge;
	private float electricFieldX, electricFieldY, electricFieldZ;
	private float magneticFieldX, magneticFieldY, magneticFieldZ;
	private float mass;


	public void calculateAccelerationX() {
		float forceX;
		forceX = (electricCharge * electricFieldX)
				+ (electricCharge * ((speedY * magneticFieldZ) - (speedZ * magneticFieldY)));
		accelarationX = forceX / mass;
	}

	public void calculateAccelarationY() {
		float forceY;
		forceY = (electricCharge * electricFieldY)
				+ (electricCharge * ((speedZ * magneticFieldX) - (speedX * magneticFieldZ)));
		accelarationY = forceY / mass;
	}

	public void calculateAccelarationZ() {
		float forceZ;
		forceZ = (electricCharge * electricFieldZ)
				+ (electricCharge * ((speedX * magneticFieldY) - (speedY * magneticFieldX)));
		accelarationZ = forceZ / mass;

	}


	public void calculateSpeedX(double dt) {

		speedX += accelarationX * dt;

	}

	public void calculateSpeedY(double dt) {

		speedY += accelarationY * dt;

	}

	public void calculateSpeedZ(double dt) {

		speedZ += accelarationZ * dt;

	}


	public void calculatePositionX(double dt) {
		x += (speedX * dt) + ((accelarationX * (Math.pow(dt, 2))) / 2);
	}

	public void calculationPositionY(double dt) {
		y += (speedY * dt) + ((accelarationY * (Math.pow(dt, 2))) / 2);
	}

	public void calculatePositionZ(double dt) {
		z += (speedZ * dt) + ((accelarationZ * (Math.pow(dt, 2))) / 2);
	}

	public double getPositionX() {
		return x;
	}

	public double getPositionY() {
		return y;
	}

	public double getPositionZ() {
		return z;
	}

	public void setPositionX(float x) {
		this.x = x + 10;
	}

	public void setPositionY(float y) {
		this.y = 280 - y;
	}

	public void setPositionZ(float z) {
		this.z = 280 - z;
	}

	public void setSpeedX(float speedX) {
		this.speedX = speedX;
	}

	public void setSpeedY(float speedY) {
		this.speedY = -speedY;
	}

	public void setSpeedZ(float speedZ) {
		this.speedZ = -speedZ;
	}

	public void setElectricFieldX(float electricFieldX) {
		this.electricFieldX = electricFieldX;

	}

	public void setElectricFieldY(float electricFieldY) {
		this.electricFieldY = -electricFieldY;
	}

	public void setElectricFieldZ(float electricFieldZ) {
		this.electricFieldZ = -electricFieldZ;
	}

	public void setMagneticFieldX(float magneticFieldX) {
		this.magneticFieldX = magneticFieldX;
	}

	public void setMagneticFieldY(float magneticFieldY) {
		this.magneticFieldY = -magneticFieldY;
	}

	public void setMagneticFieldZ(float magneticFieldZ) {
		this.magneticFieldZ = -magneticFieldZ;
	}

	public void setCharge(float electricCharge) {
		this.electricCharge = electricCharge;
	}

	public void setMass(float mass) {
		this.mass = mass;
	}
}