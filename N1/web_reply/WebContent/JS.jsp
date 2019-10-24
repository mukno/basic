<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<script>
	var Car={
				carWeight:1000,
				carHeight:500,
				carTitle:"HCar",
				carYear:2019,
				carMethod:function={
						
						alert("car 매서드(함수)")
				}
	};
	
	var car2=new Object();
		car2.carWidth=2000;
		car2.carHegith=500;
		car2.carTitle="CCar";
		car2.carYear=2019;
		car2.carMethod=function(){
			alert("car2메서드")
		}
		
	function Car3(carWeight,carHeight,carYear,carTitle){
		this.carWeight=carWeight;
		this.carHeight=carHeight;
		this.carYear=carYear;
		this.carTitle=carTitle;
		this.carMethod=function(){
			alert("car3생성자 메서드");
			}
	}

</script>
</body>
</html>