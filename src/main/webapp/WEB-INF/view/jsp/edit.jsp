<html>
<head>
<meta charset="utf-8">
<title>新規作成画面</title>
<link href="style.css" media="all" rel="stylesheet" />
</head>

<body>
	<div id="main" class="container">
		<h3 align="center">掲示板新規</h3>
		<hr size="4">
		<table border="1" cellspacing="0" cellpadding="3"
			bordercolor="#ebccd1" style="border-collapse: collapse">
			<colgroup>
				<col width="300px">
				<col width="300px">
				<col width="300px">
				<col width="300px">
			</colgroup>
			<tr>
				<td class="bg-primary">タイトル</td>
				<td><input type="text" style="width: 100%"></td>
			</tr>
			<tr>
				<td class="bg-primary">内容</td>
				<td><textarea cols="100" rows="30"></textarea></td>
			</tr>
			<tr>
				<td class="bg-primary">分類</td>
				<td><select name="group_id" size="1" style="width: 100%">
						<option value=""></option>
						<option value="1">通達／連絡</option>
						<option value="2">会議開催について</option>
						<option value="3">スケジュール</option>
						<option value="4">イベント</option>
						<option value="9">その他</option>
				</select></td>
			</tr>
		</table>

		<hr size="1">
		<div align="center">
			<a href=""><input type="button" value="登録"></a> <a href=""><input
				type="button" value="削除"></a> <a href=""><input
				type="button" value="キャンセル"></a>
		</div>
	</div>
</body>

</html>