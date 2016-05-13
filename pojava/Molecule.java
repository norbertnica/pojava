package pojava;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Molecule
{
	double x,y,z;		
	double SpeedDirectionX, SpeedDirectionY,SpeedDirectionZ;
	double AccelarationDirectionX,AccelarationDirectionY,AccelarationDirectionZ;
	float ElectricCharge;
	float ElectricFieldDirectionX,ElectricFieldDirectionY,ElectricFieldDirectionZ;
	float MagneticFieldDirectionX, MagneticFieldDirectionY, MagneticFieldDirectionZ;
	float Mass;
	
	
	//Calculations of accelerations
	
	public void CalculationOfAccelarationX()
	{
		double ForceDirectionX;
		ForceDirectionX=(ElectricCharge*ElectricFieldDirectionX)+
		(ElectricCharge*((SpeedDirectionY*MagneticFieldDirectionZ)-(SpeedDirectionZ*MagneticFieldDirectionY)));
		AccelarationDirectionX=ForceDirectionX/Mass;	
	}
	
	public void CalculationOfAccelarationY()
	{
		double ForceDirectionY;
		ForceDirectionY=(ElectricCharge*ElectricFieldDirectionY)+
		(ElectricCharge*((SpeedDirectionZ*MagneticFieldDirectionX)-(SpeedDirectionX*MagneticFieldDirectionZ)));
		AccelarationDirectionY=ForceDirectionY/Mass;
	}
	
	public void CalculationOfAccelarationZ()
	{
		double ForceDirectionZ;
		ForceDirectionZ=(ElectricCharge*ElectricFieldDirectionZ)+
		(ElectricCharge*((SpeedDirectionX*MagneticFieldDirectionY)-(SpeedDirectionY*MagneticFieldDirectionX)));
		AccelarationDirectionZ=ForceDirectionZ/Mass;
		
	}
	
	//Calculations of speeds
	
	public void CalculationOfSpeedX(double dt)
	{
		
		SpeedDirectionX+=AccelarationDirectionX*dt;
		
	}
	
	public void CalculationOfSpeedY(double dt)
	{
		
		SpeedDirectionY+=AccelarationDirectionY*dt;
		
	}
	
	public void CalculationOfSpeedZ(double dt)
	{
		
		SpeedDirectionZ+=AccelarationDirectionZ*dt;
		
	}
	
	//Calculations of positions
	 
	public void CalculationOfPositionX(double dt)
	{ 
		x += (SpeedDirectionX*dt)+((AccelarationDirectionX*(Math.pow(dt,2)))/2);
	}
	
	public void CalculationOfPositionY(double dt)
	{
		y += (SpeedDirectionY*dt)+((AccelarationDirectionY*(Math.pow(dt,2)))/2);
	}
	
	public void CalculationOfPositionZ(double dt)
	{
		z += (SpeedDirectionZ*dt)+((AccelarationDirectionZ*(Math.pow(dt,2)))/2);
	}
	
	
	

	public double getX() 
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public double getZ()
	{
		return z;
	}
	
	
	public void setX(double x) 
	{
		this.x = x;
	}
	
	public void setY(double y)
	{
		this.y = y;
	}
	
	public void setZ(double z)
	{
		this.z = z;
	}
	
	public void SetSpeedX(double SpeedX)
	{
		this.SpeedDirectionX = SpeedX;
	}

	public void SetSpeedY(double SpeedY)
	{
			this.SpeedDirectionY = SpeedY;
	}
	
	public void SetSpeedZ(double SpeedZ)
	{
			this.SpeedDirectionZ = SpeedZ;
	}
	public void setElectricFieldX(float ElectricFieldX)
	{
		this.ElectricFieldDirectionX = ElectricFieldX;
		
	}
	public void setElectricFieldY(float ElectricFieldY)
	{
		this.ElectricFieldDirectionY = ElectricFieldY;
	}
	public void setElectricFieldZ(float ElectricFieldZ)
	{
		this.ElectricFieldDirectionZ = ElectricFieldZ;
}
	public void setMagneticFieldX(float MagneticFieldX)
	{
		this.MagneticFieldDirectionX = MagneticFieldX;
	}
	public void setMagneticFieldY(float MagneticFieldY)
	{
		this.MagneticFieldDirectionY = MagneticFieldY;
	}
	public void setMagneticFieldZ(float MagneticFieldZ)
	{
		this.MagneticFieldDirectionZ = MagneticFieldZ;
	}
	public void setCharge(float charge)
	{
		this.ElectricCharge = charge;
	}
	public void setMass(float mass){
		this.Mass = mass;
	}
}