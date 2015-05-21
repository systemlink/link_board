<!DOCTYPE html>
<html>

<head>
<title>詳細画面</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="${f:url('/css/style.css')}" />
</head>

<body>
	<div class="container">
		<header>
			<h3 align="center">掲示板</h3>
			<hr size=4>
		</header>

		<div align="right">
			<s:link href="/billboards/">
				<button type="submit">戻る</button>
			</s:link>
		</div>

		<div class="mid_title">タイトル</div>
		<div>${f:h(title)}</div>

		<div class="mid_title">内容</div>
		<div>${f:br(f:h(note))}</div>

		<div class="mid_title">分類</div>
		<div>${f:h(billboardGroupId)}</div>

		<div class="mid_title">作成者</div>
		<div>${f:h(userId)}</div>
		<hr>

		<div align="center">
			<s:link href="edit/${id}">
				<button type="submit">編集</button>
			</s:link>

			<s:link href="/billboards/">
				<button type="submit">戻る</button>
			</s:link>
		</div>
	</div>
</body>

</html>