<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String s[] = request.getParameterValues("ch");
		Cookie c[] = request.getCookies();
		int flag = 0;
		
		if(c!=null){
			
			for (int i=0 ; i<s.length ; i++){
				
				flag=0;
				
				for (int j=0 ; j<c.length ; j++){
					
					String str = c[j].getName();
					
					if (str.equals(s[i])){
						out.println(s[i]+" Already Exists <br>");
						flag=1;
						break;
						
					}
				}
				
				if(flag == 0){
					Cookie c1 = new Cookie(s[i],"1");
					response.addCookie(c1);
					out.println(s[i]+" added Successfully");
				}
			}
		}
		else{
			for (int i=0 ; i<s.length ; i++){
				Cookie c1 = new Cookie(s[i],"1");
				response.addCookie(c1);
				out.println(s[i]+" added Successfully");
			}
		}
		
	%>

</body>
</html>