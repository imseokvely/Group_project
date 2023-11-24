package com.itbank.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.vo.MemberVO;
import com.itbank.model.vo.OrderVO;
import com.itbank.service.MyPageService;

@Controller
public class MypagController
{	
	@Autowired 
	private MyPageService myPageService;
	
	private OrderVO orderVO;//session���� get�ؿ´�.
	//private MemberVO memberVO;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)//orderlist���ε� ,  �������κ��� memberVO�� ���� ���ε�
	public ModelAndView myPageMain(Model model, HttpSession httpsession
			,HttpServletRequest request)throws Exception
	{
		ModelAndView mav = new ModelAndView();
		//memberVO = (MemberVO)httpsession.getAttribute("memberInfo");
		//String members_idx = memberVO.getMembers_idx()+"";//VO �����ض�
		
		List<OrderVO> myOrderList = myPageService.listMyOrderGoods("1");//���� ����Ʈ �޾ƿ��� �Լ� �����ض�(������ ���� id�� ����)
		
		mav.addObject("myOrderList", myOrderList);
		mav.setViewName("mypage/myPageMain");
		return mav;
	}
}
