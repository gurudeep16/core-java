<html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Insert title here</title>
        <link rel="stylesheet" href="bank.css">
    </head>
<body >
    <div id="page1">
   
<h2> Welcome to Bank</h2>

<form action="bank/save" method="post">
<Table class="b">
    <tr>
        <td class="b1"> Bank id :</td>
        <td><input class="a"  type="text" name="bankId"></td>
    </tr>
    <tr>
        <td class="b1">Bank Name :</td>
        <td><input class="a" type="text" name="bankName"></td>
    </tr>
    <tr>
        <td class="b1">Branch Name :</td>
        <td><input class="a" type="text" name="branchName"></td>
    </tr>
    <tr>
        <td class="b1">IFSC-Code :</td>
        <td><input class="a" type="text" name="IFSC_Code"></td>
    </tr>
    <tr>
        <td class="b1">Address :</td>
        <td><input class="a" type="text" name="address"></td>
    </tr>
</Table>
<pre>

</pre>
<input class="c" type="submit" value="Save">


</form>
<pre>


</pre>
<h2>Search Bank</h2>
 <form  method="get" action="searchname">
  <input class="d" type="text" name="bankName" /> &nbsp;
  <input type="submit" value="Search" />
 </form>
 <pre>


 </pre>
</div>

</body>
</html>
