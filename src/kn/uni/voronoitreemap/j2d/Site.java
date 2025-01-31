/*******************************************************************************
 * Copyright (c) 2013 Arlind Nocaj, University of Konstanz.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * For distributors of proprietary software, other licensing is possible on request: arlind.nocaj@gmail.com
 * 
 * This work is based on the publication below, please cite on usage, e.g.,  when publishing an article.
 * Arlind Nocaj, Ulrik Brandes, "Computing Voronoi Treemaps: Faster, Simpler, and Resolution-independent", Computer Graphics Forum, vol. 31, no. 3, June 2012, pp. 855-864
 ******************************************************************************/
package kn.uni.voronoitreemap.j2d;

import java.awt.Color;
import java.awt.Graphics2D;

import kn.uni.voronoitreemap.debuge.Colors;

/**
 * Extended Version of a site, which has relative Positions
 * @author Arlind Nocaj
 *
 */
public class Site extends ASite {
	/**
	 * This attribute is used to mark the sites, which are only added to bound the Voronoi diagram.
	 */
	public boolean isDummy;

	/**
	  * 
	  * @param x x-coordinate
	  * @param y y-coordinate
	  */
	 public Site(double x, double y){
		super(x,y);
	 }
	 
	 /**
	  * 
	  * @param x x-coordinate
	  * @param y y-coordinate
	  * @param weight the weight of the site, where weight=radius*radius which is used for weighting
	  */
	 public Site(double x, double y, double weight){
		super(x,y,weight);
	 }
	 
	 public Site(double x, double y, double weight, double percentage){
		 super(x,y,weight,percentage); 
	 }
	 
	 public Site clone(){
		 Site site = new Site(x, y, weight);
		 site.isDummy = this.isDummy;
		 site.originalObject = this.originalObject;
		 site.percentage = this.percentage;

		 return site;
	 }

	public void setAsDummy() {
		this.isDummy=true;
	}
}
