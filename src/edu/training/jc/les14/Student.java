package edu.training.jc.les14;

public class Student {
	private String name;
	private int group;
	private int[] performance;

	public Student(String name, int group, int[] perfomance) {
		this.name = name;
		this.group = group;
		this.performance = perfomance;
	}

	public String getName() {
		return name;
	}

	public int getGroup() {
		return group;
	}

	public int[] getPerformance() {
		return performance;
	}

}