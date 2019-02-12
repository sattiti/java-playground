package lib;

import java.util.Map;
import java.util.HashMap;

// state wrapper class
public class ToolKitsPannel
{
    /**
     *
     */
    private Map<String, Tool> _toolMap;

    /**
     *
     */
    private Tool _currentTool;


    /**
     *
     */
    public ToolKitsPannel()
    {
        _toolMap = new HashMap<String, Tool>();
    }

    /**
     *
     */
    public void addTool(String toolName, Tool tool)
    {
        _toolMap.put(toolName, tool);
    }

    /**
     * tool の選択 (状態を変化させる)
     */
    public void selectTool(String toolName)
    {
        _currentTool = _toolMap.get(toolName);
    }

    /**
     * 実行する
     */
    public void exec()
    {
        if(_currentTool != null) {
            _currentTool.exec();
        }
        else {
            System.out.println("ツールを選択してください。");
        }
    }

}
