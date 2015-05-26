<!DOCTYPE html>
<html>

<head>
<title>新規登録画面</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="${f:url('/css/style.css')}" />
</head>

<body>

	<html:errors />

	<div class="container">
		<header>
			<h3 align="center">掲示板新規</h3>
			<hr size=4>
		</header>
		<br>
		<s:form enctype="multipart/form-data">
			<input type="file" name="formfile" />
			<br />

			<table border=1>
				<colgroup>
					<col width="300px">
					<col width="450px">
					<col width="300px">
					<col width="450px">
				</colgroup>

				<tr>
					<td class="bg-primary">タイトル</td>
					<td><html:text property="title" style="width: 100%" /></td>
				</tr>

				<tr>
					<td class="bg-primary">内容</td>
					<td><html:textarea property="note" cols="100" rows="30" /></td>
				</tr>

				<tr>
					<td class="bg-primary">分類</td>
					<td><html:select property="billboardGroupId"
							style="width: 100%">
							<option></option>
							<c:forEach var="e" varStatus="s" items="${nameMstItems}">
								<html:option value="${e.id}">${e.name}</html:option>
							</c:forEach>
						</html:select></td>
				</tr>

			</table>
			<br>
			<hr>

			<div align="center">
				<input type="submit" name="insert" value="登録" />
				<s:link href="/billboards/">
					<button type="submit">キャンセル</button>
				</s:link>

			</div>
		</s:form>
	</div>
</body>

</html>