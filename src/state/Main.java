import lib.*;

public class Main
{
    /**
     * 内部の状態変化に応じて、動作も変化するパターン
     */
    public static void main(String[] args)
    {
        ToolKitsPannel pannel = new ToolKitsPannel();

        // パネルに描画ツール(状態)を追加
        Tool tool1 = new LinePenTool();
        Tool tool2 = new EraseTool();

        pannel.addTool(LinePenTool.NAME, tool1);
        pannel.addTool(EraseTool.NAME, tool2);

        // LinePenTool を選択し、実行(状態変化)
        pannel.selectTool(LinePenTool.NAME);
        pannel.exec();
        
        // EraseTool を選択し、実行(状態変化)
        pannel.selectTool(EraseTool.NAME);
        pannel.exec();
    }
}
