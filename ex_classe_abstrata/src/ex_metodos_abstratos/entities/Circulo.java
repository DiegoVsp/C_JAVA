package ex_metodos_abstratos.entities;

import ex_metodos_abstratos.Color;

public class Circulo extends Shape {

	private Double radius;

	public Circulo() {
	}

	public Circulo(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {

		return Math.PI * radius * radius;
	}

}