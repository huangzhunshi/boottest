Feature:  仓储相关功能

  Scenario: 库存盘点
    Given  选择要盘点的仓库
    When  开始盘点
    And   输入盘点后结果
    Then  数据入库
