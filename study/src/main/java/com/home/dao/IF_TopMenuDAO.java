package com.home.dao;

import java.util.List;

import com.home.vo.TopMenuVO;

/**
 * 대메뉴 인터페이스
 * @author user
 *
 */
public interface IF_TopMenuDAO {
	public boolean insertMenu(TopMenuVO topmenuVO); 
	public boolean deleteMenu(TopMenuVO topmenuVO);	
	public boolean updateMenu(TopMenuVO topmenuVO);
	public List<TopMenuVO> selectMenu(); //대메뉴 전부 불러오는함수
	public TopMenuVO selectMenu(TopMenuVO topMenuVO); //대메뉴
	public TopMenuVO selectMenu(int topMenuNO);
}
