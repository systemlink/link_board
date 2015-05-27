<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>新規作成画面</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/style.css')}" />
</head>

<body>

	<html:errors />

	<s:form>
		<html:hidden property="id" />
		<div id="main" class="container">
			<h3 align="center">掲示板新規</h3>
			<hr size="4" />
			<table border="1" cellspacing="0" cellpadding="3">
				<colgroup>
					<col width="300px" />
					<col width="300px" />
					<col width="300px" />
					<col width="300px" />
				</colgroup>
				<tr>
					<td class="bg-primary">タイトル</td>
					<td><html:text property="title" style="width: 99%" /></td>
				</tr>
				<tr>
					<td class="bg-primary">内容</td>
					<td><html:textarea property="note" cols="100" rows="30" /></td>
				</tr>
				<tr>
					<td class="bg-primary">分類</td>
					<td><html:select property="billboardGroupId" size="1" value="${billboardGroupId}"
							style="width: 100%">
							<c:forEach var="e" varStatus="s" items="${nameMstItems}">
								<html:option value="${f:h(e.id)}">${f:h(e.name)}</html:option>
							</c:forEach>
						</html:select></td>
				</tr>
			</table>

			<hr size="1" />
			<div align="center">
				<input type="submit" name="update" value="編集" /> <input type="submit" name="delete" value="削除" /> <input
					type="submit" name="index" value="キャンセル" />
			</div>
		</div>
	</s:form>
</body>

</html>