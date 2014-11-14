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
                    <input type="text" name="id" id="id">
                    <input type="submit" value="查询">
                </form>
            </div>

            <div class="man-tbl-list">
                <table class="man-tbl">
                    <button class="add-btn" onclick="add()">
                        添加
                    </button>
                <#if mans??>
                    <tr>
                        <th width="10%">编号</th>
                        <th width="30">姓名</th>
                        <th width="20">年龄</th>
                        <th width="20">性别</th>
                        <th width="20">操作</th>
                    </tr>
                    <#list mans as man>
                        <tr>
                            <td width="10%">${man.id}</td>
                            <td width="30%">${man.name}</td>
                            <td width="20%">${man.age}</td>
                            <td width="20%">${man.sex}</td>
                            <td width="20%" class="del">
                                <button type="button" class="del-btn" onclick="del(${man.id})">
                                    删除
                                </button>
                            </td>
                        </tr>
                    </#list>
                </#if>
                </table>
            </div>
        </div>

    <script type="text/javascript">
        var del = function (id) {
            location.href = "del_man?id="+id;
        }
    </script>
    </body>
</html>