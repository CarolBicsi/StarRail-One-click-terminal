package emu.lunarcore.server.packet.recv;

import emu.lunarcore.proto.StartChallengeCsReqOuterClass.StartChallengeCsReq;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;

@Opcodes(CmdId.StartChallengeCsReq)
public class HandlerStartChallengeCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        var req = StartChallengeCsReq.parseFrom(data);
        
        // Parse buff ids
        int firstHalfBuff = 0;
        int secondHalfBuff = 0;

        if (req.getMutableStoryInfo().hasNewStoryBuffInfo()) {
            var storyBuffs = req.getMutableStoryInfo().getMutableNewStoryBuffInfo();
            firstHalfBuff = storyBuffs.getFirstHalf();
            secondHalfBuff = storyBuffs.getSecondHalf();
        } else if (req.getMutableStoryInfo().hasStoryBuffInfo()) {
            var storyBuffs = req.getMutableStoryInfo().getMutableStoryBuffInfo();
            firstHalfBuff = storyBuffs.getStoryBuffOne();
            secondHalfBuff = storyBuffs.getStoryBuffTwo();
        }
        
        // Start challenge
        session.getPlayer().getChallengeManager().startChallenge(req.getChallengeId(), req.getLineup1(), req.getLineup2(), firstHalfBuff, secondHalfBuff);
    }

}
