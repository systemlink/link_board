<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="${f:url('/css/style.css')}" />
<title>トップ画面</title>
</head>

<body>

	<html:errors />

	<div class="container">
		<header>
			<h3 align="center">掲示板</h3>
			<hr size=4>
		</header>

		<div align="right">
			<button type="submit">戻る</button>
			<s:link href="cleate">
				<button type="submit">新規作成</button>
			</s:link>
		</div>

		<table border=1>
			<colgroup>
				<col width="130px">
				<col width="130px">
				<col width="450px">
				<col width="130px">
				<col width="70px">
				<col width="70px">
			</colgroup>
			<thead>
				<td>作成日</td>
				<td>分類</td>
				<td>タイトル</td>
				<td>作成者</td>
				<td></td>
				<td></td>
			</thead>
			<c:forEach var="e" varStatus="s" items="${billboardsItems}">
				<tr>
					<td>${f:h(e.createdAt)}</td>
					<td>${f:h(e.billboardGroupId)}</td>
					<td>${f:h(e.title)}</td>
					<td>${f:h(e.userId)}</td>
					<td align="center"><s:link href="show/${e.id}">
							<button type="submit">詳細</button>
						</s:link></td>
					<td align="center"><s:link href="edit/${e.id}">
							<button type="submit">編集</button>
						</s:link></td>
				<tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>