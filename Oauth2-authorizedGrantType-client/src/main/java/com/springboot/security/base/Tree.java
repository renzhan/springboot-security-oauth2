package com.springboot.security.base;

import java.util.List;
/**
 * 菜单树
 */
public class Tree<T> {
	
	
	private Integer id;
	
	private String name;
	 
	private boolean isParent=false;

    private boolean open=true;
    
    private boolean checked=false;
	
    private	List<T> children;


	public List<T> getChildren() {
		return children;
	}

	public void setChildren(List<T> children) {
		this.children = children;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getIsParent() {
	        return isParent;
	}

    public void setIsParent(boolean isParent) {
        this.isParent = isParent;
    }

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public void setParent(boolean isParent) {
		this.isParent = isParent;
	}
	
	
}
