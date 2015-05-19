
<html>
<head>
<meta charset="utf-8">
<title>一覧画面</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/style.css')}" />
</head>

<body>
	<div id="main" class="container">
		<h3 align="center">掲示板</h3>
		<hr size="4">
		<form method="get">
			<div align="right">
				<a href=""><input type="button" value="＋戻る"></a> <a href=""><input
					type="button" value="＋新規作成"></a>
			</div>
			<table border="1" cellspacing="0" cellpadding="5"
				style="border-collapse: collapse">
				<colgroup>
					<col width="100px">
					<col width="100px">
					<col width="400px">
					<col width="100px">
					<col width="40px">
					<col width="40px">
				</colgroup>
				<thead>
					<td>作成日</td>
					<td>分類</td>
					<td>タイトル</td>
					<td>作成者</td>
					<td></td>
					<td></td>
				</thead>
				<tr>
					<td>2015/5/18</td>
					<td>イベント</td>
					<td>タイトル</td>
					<td>田中太郎</td>
					<td><input type="button" value="詳細"></td>
					<td><input type="button" value="編集"></td>
				</tr>
			</table>
		</form>
	</div>
</body>

</html>