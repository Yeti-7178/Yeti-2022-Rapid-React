package frc.robot.commands.Auto;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;

public class AutonDoNothing extends SequentialCommandGroup{

    public AutonDoNothing(){
        addCommands(new WaitCommand(10));
    }
    
}
