/**
 * Mainbo.com Inc.
 * Copyright (c) 2015-2017 All Rights Reserved.
 */
package com.tmser.java.parser;

/**
 * <pre>
 *
 * </pre>
 *
 * @author tjx1222
 * @version $Id: Magic.java, v 1.0 2016��11��6�� ����10:07:46 tjx1222 Exp $
 */
public class Magic extends CommJavaElement {
	public final String NAME = "magic";
	
	public Magic(final byte[] classbytes){
		super(classbytes,0);
	}
	
	@Override
	public String print(){
		StringBuilder sb = new StringBuilder();
		for(byte b : getData()){
			sb.append(Integer.toHexString(b&0xff));
		}
		return sb.toString();
	}
	
	@Override
	protected Range getPositionRange(){
		return new Range(0,4);
	}

	/**
	 * @return
	 * @see com.tmser.java.parser.JavaElement#getName()
	 */
	@Override
	public String getName() {
		return NAME;
	}
	
}
