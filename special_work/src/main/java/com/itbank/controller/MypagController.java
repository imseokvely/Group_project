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
@RequestMapping(value="/mypage")
public class MypagController
{	
	@Autowired 
	private MyPageService myPageService;
	
	private OrderVO orderVO;//session에서 get해온다.
	//private MemberVO memberVO;
	
	@RequestMapping(value = "/myPageMain", method = RequestMethod.GET)//orderlist바인딩 ,  세션으로부터 memberVO에 정보 바인딩
	public ModelAndView myPageMain(Model model, HttpSession httpsession
			,HttpServletRequest request)throws Exception
	{
		ModelAndView mav = new ModelAndView();
		//memberVO = (MemberVO)httpsession.getAttribute("memberInfo");
		//String members_idx = memberVO.getMembers_idx()+"";//VO 구현해라
		
		List<OrderVO> myOrderList = myPageService.listMyOrderGoods("1");//오더 리스트 받아오는 함수 구현해라(위에서 받은 id를 토대로)
		
		mav.addObject("myOrderList", myOrderList);
		mav.setViewName("mypage/myPageMain");
		System.out.println("컨트롤러 실행됨");
		return mav;
	}
	@RequestMapping(value = "/myDetailInfo", method = RequestMethod.GET)//orderlist바인딩 ,  세션으로부터 memberVO에 정보 바인딩
	public ModelAndView myDetailInfo(Model model, HttpSession httpsession
			,HttpServletRequest request)throws Exception
	{
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
}
