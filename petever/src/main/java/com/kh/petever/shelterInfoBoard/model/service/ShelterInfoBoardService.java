package com.kh.petever.shelterInfoBoard.model.service;

import java.util.List;

import com.kh.petever.shelterInfoBoard.model.vo.ShelterInfoBoard;

public interface ShelterInfoBoardService {

	 List<ShelterInfoBoard> selectBoardList(int limit, int offset); 

	 int selectBoardTotalContents();

}
