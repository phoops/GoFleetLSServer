package org.gofleet.openLS.ddbb.bean;

// Generated 07-oct-2011 14:06:19 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

import com.vividsolutions.jts.geom.Geometry;

/**
 * RoutingTemplate generated by hbm2java
 */
@Entity
@javax.persistence.Entity
@Table(appliesTo = "routing")
@javax.persistence.Table(name = "routing")
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Routing implements java.io.Serializable {

	private int id;
	private double cost;
	private double reverseCost;
	private int source;
	private int target;
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private double toCost;
	private String rule;
	private Geometry geometry;

	public Routing() {
	}

	public Routing(int id, Geometry theGeom, double cost, double reverseCost,
			int source, int target, double x1, double y1, double x2, double y2,
			double toCost) {
		this.id = id;
		this.geometry = theGeom;
		this.cost = cost;
		this.reverseCost = reverseCost;
		this.source = source;
		this.target = target;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.toCost = toCost;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "cost", nullable = false, precision = 17, scale = 17)
	public double getCost() {
		return this.cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Column(name = "reverse_cost", nullable = false, precision = 17, scale = 17)
	public double getReverseCost() {
		return this.reverseCost;
	}

	public void setReverseCost(double reverseCost) {
		this.reverseCost = reverseCost;
	}

	@Column(name = "source", nullable = false)
	public int getSource() {
		return this.source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	@Column(name = "target", nullable = false)
	public int getTarget() {
		return this.target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	@Column(name = "x1", nullable = false, precision = 17, scale = 17)
	public double getX1() {
		return this.x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	@Column(name = "y1", nullable = false, precision = 17, scale = 17)
	public double getY1() {
		return this.y1;
	}

	public void setY1(double y1) {
		this.y1 = y1;
	}

	@Column(name = "x2", nullable = false, precision = 17, scale = 17)
	public double getX2() {
		return this.x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	@Column(name = "y2", nullable = false, precision = 17, scale = 17)
	public double getY2() {
		return this.y2;
	}

	public void setY2(double y2) {
		this.y2 = y2;
	}

	@Column(name = "to_cost", nullable = false, precision = 17, scale = 17)
	public double getToCost() {
		return this.toCost;
	}

	public void setToCost(double toCost) {
		this.toCost = toCost;
	}

	@Column(name = "rule")
	public String getRule() {
		return this.rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

	@Column(name = "geometry")
	public Geometry getGeometry() {
		return this.geometry;
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}

}
