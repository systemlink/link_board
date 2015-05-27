<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>一覧画面</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/style.css')}" />
</head>
<body>

	<html:errors />
	<div id="main" class="container">
		<h3 align="center">掲示板</h3>
		<hr size="4" />
		<div align="right">
			<s:form>
				<input type="submit" name="index" value="戻る" />
				<input type="submit" name="create" value="新規作成" />
			</s:form>
		</div>
		<table border="1" cellspacing="0" cellpadding="5">
			<colgroup>
				<col width="100px" />
				<col width="150px" />
				<col width="400px" />
				<col width="100px" />
				<col width="55px" />
				<col width="55px" />
			</colgroup>
			<tr>
				<th>作成日</th>
				<th>分類</th>
				<th>タイトル</th>
				<th>作成者</th>
				<th></th>
				<th></th>
			</tr>
			<c:forEach var="e" varStatus="s" items="${billboardItems}">
				<tr
					style="background-color:${s.index %2 == 0 ? '#f9f9f9' : 'white'}">
					<td>${f:h(e.createdAt)}</td>
					<td>${f:h(e.nameMst.name)}</td>
					<td>${f:h(e.title)}</td>
					<td>${f:h(e.user.name)}</td>
					<td><s:link href="show/${e.id}">
							<button type="submit">詳細</button>
						</s:link></td>
					<td><s:link href="edit/${e.id}">
							<button type="submit">編集</button>
						</s:link></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>

</html>