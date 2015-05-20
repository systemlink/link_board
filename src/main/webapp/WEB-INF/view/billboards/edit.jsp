<!DOCTYPE html>
<html>

<head>
<title>編集画面</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="${f:url('/css/style.css')}" />
</head>

<body>
	<div class="container">
		<header>
			<h3 align="center">掲示板編集</h3>
			<hr size=4>
		</header>
		<br>

		<s:form>
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
							<option value=""></option>
							<option value="1">通達／連絡</option>
							<option value="2">会議開催について</option>
							<option value="3">スケジュール</option>
							<option value="4">イベント</option>
							<option value="9">その他</option>
						</html:select></td>
				</tr>
			</table>
			<br>
			<hr>

			<div align="center">
				<button type="submit">登録</button>
				<button type="submit">削除</button>
				<button type="submit">キャンセル</button>
			</div>
		</s:form>
	</div>
</body>

</html>