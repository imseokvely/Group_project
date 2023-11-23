package com.itbank.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.vo.MemberVO;
import com.itbank.model.vo.OrderVO;
import com.itbank.service.MyPageService;

@Controller
@RequestMapping("/mypage")
public class MypagController
{	
	@Autowired private MyPageService myPageService;
	
	@Autowired
	private OrderVO OrderVO;//session���� get�ؿ´�.
	@Autowired
	private MemberVO memberVO;
	@GetMapping("/myPageMain")//orderlist���ε� ,  �������κ��� memberVO�� ���� ���ε�
	public ModelAndView myPageMain(Model model, HttpSession httpsession)throws Exception
	{
		memberVO = (MemberVO)httpsession.getAttribute("memberInfo");
		String members_idx = OrderVO.getOrders_idx()+"";//VO �����ض�
		
		ModelAndView mav = new ModelAndView();
		List<OrderVO> myOrderList = myPageService.listMyOrderGoods(members_idx);//���� ����Ʈ �޾ƿ��� �Լ� �����ض�(������ ���� id�� ����)
		
		mav.addObject("myOrderList",myOrderList);
		mav.setViewName("mypage/myPageMain");
		return mav;
	}
}
