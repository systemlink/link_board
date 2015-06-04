<!DOCTYPE html>
<html>

<head>
<title>編集画面</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="${f:url('/css/style.css')}" />
</head>

<body>

	<html:errors />

	<div class="container">
		<header>
			<h3 align="center">掲示板編集</h3>
			<hr size=4>
		</header>
		<br>

		<s:form>
			<html:hidden property="id" />
			<html:hidden property="userId" />
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
							value="${billboardGroupId}" style="width: 100%">
							<c:forEach var="e" varStatus="s" items="${nameMstItems}">
								<html:option value="${e.id}">${e.name}</html:option>
							</c:forEach>
							<!--   編集画面で必須項目の未記入エラーを起こすと何も表示されなくなる
							<c:forEach var="e" varStatus="s" items="${nameMstItems}">
								<option value="${e.id}">${e.name}</option>
							</c:forEach>

					-->
						</html:select></td>
				</tr>
			</table>
			<br>
			<hr>

			<div align="center">
				<input type="submit" name="update" value="登録" /> <input
					type="submit" name="delete" value="削除" />
				<s:link href="/billboards/">
					<button type="submit">キャンセル</button>
				</s:link>
			</div>
		</s:form>
	</div>
</body>

</html>