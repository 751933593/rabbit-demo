package com.jikeh.image;


import java.io.Serializable;


/**
 * @author plw
 *
 */
public class ScpImage implements Serializable{
	private static final long serialVersionUID = -2790387742562982201L;
	
	private Integer id;// ����
	
	private Integer case_id;// �ⰸid 
	
	private String case_no;//�ⰸ��

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the case_id
	 */
	public Integer getCase_id() {
		return case_id;
	}

	/**
	 * @param case_id the case_id to set
	 */
	public void setCase_id(Integer case_id) {
		this.case_id = case_id;
	}

	/**
	 * @return the case_no
	 */
	public String getCase_no() {
		return case_no;
	}

	/**
	 * @param case_no the case_no to set
	 */
	public void setCase_no(String case_no) {
		this.case_no = case_no;
	}
	
	
	
	
	
}
