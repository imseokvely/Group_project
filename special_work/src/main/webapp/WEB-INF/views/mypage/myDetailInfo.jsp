<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="../header.jsp" %><%--html body�±׸� �ݾ����� --%>

<body>
<h3>�� �� ����</h3>
 <form name="frm_mod_member">
  <div id="detail_table">
   <table>
   	<tbody>
   	
   	 <tr class="dot_line">
   	  <td class="fixed_join">���̵�</td>
   	  <td><input name="member_id" type="text" size="20" value="${memberInfo }" disabled/></td>
   	  <%--memberInfo���� ���ε� ���ּ���--%>
   	  <td></td>
   	 </tr>
   	 
   	 <tr class="dot_line">
   	  <td class="fixed_join">�г���</td>
   	  <td><input name="member_nick" type="text" size="20" value="${memberInfo.members_nickname}"/></td>
   	  <td><input type="button" value="����" onclick="fn_modify_member_info('member_pw')"/></td>
   	 </tr>
   	 
   	 <tr class="dot_line">
   	  <td class="fixed_join">��й�ȣ</td>
   	  <td><input name="member_pw" type="password" size="20" value="${memberInfo.member_pw }"/></td>
   	  <td><input type="button" value="����" onclick="fn_modify_member_info('member_nick')"/></td>
   	 </tr>
   	 
   	 <tr class="dot_line">
   	  <td class="fixed_join">�̸�</td>
   	  <td><input name="member_name" type="text" size="20" value="${memberInfo.member_name } disabled"/>
   	 </tr>
   	 
   	 <tr class="dot_line">
   	  <td class="fixed_join">��ȭ��ȣ</td>
   	  <td>
   	   <select name="tell" id="tell">
   	    <option>����</option>
		<option value="010">010</option>
		<option value="011">011</option>
		<option value="016">016</option>
		<option value="017">017</option>
		<option value="018">018</option>
		<option value="019">019</option>
   	   </select>
   	   
   	 
   	   -<input type="text" size=4 name="tel2" value="${memberInfo.members_phone_number.substring(3,7) }">
   	   -<input type="text" size=4 name="tel3" value="${memberInfo.members_phone_number.substring(7,11) }">
   	  </td>
   	  
   	  <td>
   	   <input type="button" value="����" onClick="fn_modify_member_info('tel')"/>
   	  </td>
   	 </tr>
   	 
   	 <tr class="dot_line">
   	  <td class="fixed_join">�̸���<br>(e-mail)</td>
   	  <td>
   	   <input type="text" name="email" size=10 value="${memberInfo.email }"/> @<inpt type="text" size=10 name="email2" value="${memberInfo.members_email }"/>
   	   <select name="select_email" onChange="" title="�����Է�">
   	    <option value="non">�����Է�</option>
   	    <option value="hanmail.net">hanmail.net</option>
   	    <option value="naver.com">naver.com</option>
   	    <option value="yahoo.co.kr">yahoo.co.kr</option>
   	    <option value="hotmail.com">hotamil.com</option>
   	    <option value="paran.com">paran.com</option>
		<option value="nate.com">nate.com</option>
		<option value="google.com">google.com</option>
		<option value="gmail.com">gmail.com</option>
		<option value="empal.com">empal.com</option>
		<option value="korea.com">korea.com</option>
		<option value="freechal.com">freechal.com</option>
   	    
   	   </select>
   	  </td>
   	  <td>
   	  	<input type="button" value="�����ϱ� " onClick="fn_modify_member_info('email')"/>
   	  </td>
   	 </tr>
   	 
   	 
   	</tbody>
   </table>
  </div>	
 </form>

</body>
</html>