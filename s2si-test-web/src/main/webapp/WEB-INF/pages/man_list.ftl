<html>
    <head>
        <meta charset="utf-8">
        <titile>小人测试</titile>
    </head>

    <body>
        <div>
            <div class="findById">
                <form action="find_man" method="post">
                    人的ID:
                    <input type="text" name="id">
                    <input type="submit" value="查询">
                </form>

            </div>
            <div class="man-list">
                <button class="add-btn" onclick="add_simple!add">
                    添加
                </button>
                <#list manList as man>
                    <tr>
                        <td>id:${man.id}</td>
                        <td>name:${man.name}</td>
                        <td>age:${man.age}</td>
                        <td>sex:${man.sex}</td>
                        <td class="del">
                            <button type="button" class="del-btn" onclick="del_simple!del?id=${man.id}">
                                删除
                            </button>
                        </td>

                    </tr>
                </#list>
            </div>
        </div>
    </body>
</html>